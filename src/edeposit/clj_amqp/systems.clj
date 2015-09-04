(ns edeposit.clj-amqp.systems
  (:require [com.stuartsierra.component :as component]
            [environ.core :refer [env]]
            [edeposit.amqp.pdfbox.components :refer [new-pdfbox-amqp]]
            [edeposit.amqp.epubcheck.components :refer [new-epubcheck-amqp]]
            ))

(defn prod-system []
  (component/system-map
   :pdfbox-amqp (new-pdfbox-amqp
                 (env :pdfbox-amqp-uri)
                 (env :pdfbox-amqp-exchange) 
                 (env :pdfbox-amqp-qname)
                 (env :pdfbox-debug)
                 )
   :epubcheck-amqp (new-epubcheck-amqp
                    (env :epubcheck-amqp-uri)
                    (env :epubcheck-amqp-exchange) 
                    (env :epubcheck-amqp-qname)
                    )
   )
  )

(ns edeposit.clj-amqp.main
  (:require [clojure.java.io :as io]
            [clojure.tools.cli :as cli]
            [edeposit.clj-amqp.systems :refer [prod-system]]
            [reloaded.repl :refer [system init start stop go reset]]
            )
  (:gen-class :main true)
  )

(defn -main [& args]
  (let [ [options args banner] (cli/cli args
                                        [ "--amqp" :default false :flag true]
                                        [ "-h" "--help" :default false :flag true]
                                        )
         ]
    (println "ahoj")
    (when (:help options)
      (println banner)
      (System/exit 0)
      )
    (when (:amqp options)
      (reloaded.repl/set-init! prod-system)
      (go)
      )
    )
  )

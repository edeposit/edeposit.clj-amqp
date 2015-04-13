(defproject edeposit.clj-amqp "0.1.0"
  :description "E-Deposit: Main package to run all amqp services written in clojure"
  :url "https://github.com/edeposit/edeposit.clj-amgp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.xml "0.0.8"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/data.zip "0.1.1"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.apache.pdfbox/pdfbox "1.8.3"]
                 [org.apache.pdfbox/preflight "1.8.3"]
                 [com.novemberain/langohr "3.0.1"]
                 [clj-time "0.8.0"]
                 [org.clojure/data.json "0.2.5"]
                 [environ "1.0.0"]
                 [org.clojure/tools.namespace "0.2.9"]
                 [reloaded.repl "0.1.0"]
                 [me.raynes/fs "1.4.6"]
                 [org.clojure/tools.nrepl "0.2.7"]
                 [org.clojure/tools.logging "0.3.1"]
                 [commons-codec/commons-codec "1.10"]
                 [org.clojure/tools.logging "0.3.1"]
                 [edeposit.amqp.epubcheck "0.1.0"]
                 [edeposit.amqp.pdfbox "0.1.0"]
                 ]
  :main edeposit.clj-amqp.main
  :aot [edeposit.clj-amqp.main]
)
(comment  ;; hook for emacs
  (add-hook 'after-save-hook 'lein-compile nil t)
)

(defproject edeposit.clj-amqp "0.1.0-SNAPSHOT"
  :description "E-Deposit: Main package to run all amqp services written in clojure"
  :url "https://github.com/edeposit/edeposit.clj-amgp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.clojure/data.zip "0.1.1"]
                 [clj-time "0.8.0"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.idpf/epubcheck "4.0.0-alpha11"]
                 [com.novemberain/langohr "3.0.1"]
                 [environ "1.0.0"]
                 [org.danielsz/system "0.1.4"]
                 [org.clojure/tools.namespace "0.2.9"]
                 [me.raynes/fs "1.4.6"]
                 [reloaded.repl "0.1.0"]
                 [org.clojure/tools.nrepl "0.2.7"]
                 [byte-streams "0.2.0-alpha8"]
                 ]
  :main edeposit.clj-amqp.main
  :aot edeposit.clj-amqp.main
  :deploy-repositories [["releases" :clojars]]
)

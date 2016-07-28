(ns user
  (:require [mount.core :as mount]
            unstate.core))

(defn start []
  (mount/start-without #'unstate.core/repl-server))

(defn stop []
  (mount/stop-except #'unstate.core/repl-server))

(defn restart []
  (stop)
  (start))



(ns unstate.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[unstate started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[unstate has shut down successfully]=-"))
   :middleware identity})

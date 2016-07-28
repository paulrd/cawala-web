(ns unstate.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [unstate.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[unstate started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[unstate has shut down successfully]=-"))
   :middleware wrap-dev})

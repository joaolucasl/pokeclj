(ns pokeclj.handler
  (:require [compojure.core :refer :all]
            [pokeclj.controller :as controller]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/species" [] (controller/species))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
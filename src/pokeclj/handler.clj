(ns pokeclj.handler
   (:require [compojure.core :refer :all]
             [pokeclj.controller :as controller]
             [compojure.route :as route]
             [ring.middleware 
              [defaults :refer [wrap-defaults site-defaults]]
              [json :refer [wrap-json-response]]
             ]
             [pokeclj.db.db :as db]))

(db/load-data)

(defroutes handler
  (GET "/" [] "Hello World")
  (GET "/species" [] (controller/species))
  (route/not-found "Not Found"))

(def app
  (->
    handler
    (wrap-json-response)
    (wrap-defaults site-defaults)))
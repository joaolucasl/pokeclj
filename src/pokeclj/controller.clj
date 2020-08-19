(ns pokeclj.controller (:require [pokeclj.db.db :as db] [ring.util.response :refer [response]]))

(defn species []  (response { :pokemons (:pokemons @db/data) }) )
(ns pokeclj.controller (:require [pokeclj.db.db :as db] [clojure.data.json :as json]))

(defn species [] (json/write-str (:pokemons @db/data)))

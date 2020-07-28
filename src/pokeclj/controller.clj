(ns pokeclj.controller (:require [pokeclj.db.db :as db]))

(defn species [] (str (:pokemons @db/data)))

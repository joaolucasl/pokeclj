(ns pokeclj.db.db
  (:require [clojure.java.io :as io]
             [clojure.data.json :as json]
            ))

(def data
  (atom {:pokemons [{:name "Bulbasaur"
                     :num 1
                     :type ["Grass" "Poison"]}]}))

(defn load-data []
  (reset! data { :pokemons (json/read-str (slurp (io/resource "public/pokedex.json"))) } ))
(ns reverse-string)
(require '[clojure.string :as str])

(defn rev [collection]
  (into () collection))

(defn reverse-string [s]
  (apply str (rev s)))

(reverse-string "Plow")

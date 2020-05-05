(ns bob (:require [clojure.string :as st]))

(def responses
  {:yelling "Whoa chill out!"
   :question "Sure."
   :loud-question "Calm down, I know what I'm doing"
   :blank "Fine. Be that way"
   :default "Whatever"})

(defn- yelling? [s]
  (and (some #(Character/isLetter %) s)
       (= s (st/upper-case s))))

(defn- question? [s]
  (= \? (last (st/trimr s))))

(defn response-for [s]
  ())
(ns bob
  (:require [clojure.string :as st]))

;; (def responses
;;   {:yelling       "Whoa, chill out!"
;;    :question      "Sure."
;;    :loud-question "Calm down, I know what I'm doing!"
;;    :blank         "Fine. Be that way!"
;;    :default       "Whatever."})

;; (defn- yelling? [s]
;;   (and (some #(Character/isLetter %) s)
;;        (= s (st/upper-case s))))

;; (defn- question? [s]
;;   (= \? (last (st/trimr s))))

;; (defn respond [s]
;;   (if (st/blank? s)
;;     :blank
;;     (let [q? (question? s)
;;           y? (yelling? s)]
;;       (cond q? (if y? :loud-question :question)
;;             y? :yelling
;;             :else :default))))

;; (defn response-for [s]
;;   (responses (respond s)))

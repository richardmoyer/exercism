(ns armstrong-numbers)

;; (defn exponent (count (str num)))

;; (defn digits [n]
;;   (if pos? n)
;;   (conj (digits (quot n 10) (mod n 10) )
;;         []))
;; (defn check [num]
;;   ())

;; (defn armstrong? [num]
;;   (if (= (num))))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn num-to-digit [num]
  (mapv #(Character/digit % 10) (str num)))

(defn armstrong? [num]
  (let [digits (num-to-digit num)
        len (count digits)]
    (= num (reduce #(+ %1 (exp %2 len)) 0 digits))))

(armstrong? 153)

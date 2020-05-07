(ns armstrong-numbers)

(defn exp [x n]
  (reduce * (repeat n x)))

(defn num-to-digit [num]
  (mapv #(Character/digit % 10) (str num)))

(defn armstrong? [num]
  (let [digits (num-to-digit num)
        len (count digits)]
    (= num (reduce #(+ %1 (exp %2 len)) 0 digits))))

(armstrong? 21897142587612075)

(ns rna-transcription)

(defn to-rna [dna]
  (apply str  (map #(case  %
                       \C  "G"
                       \G  "C"
                       \T  "A"
                       \A  "U"
                       (throw (AssertionError. ))) dna )))
(to-rna "GCTATCGTA")

(ns metodos.core
 (:gen-class))

(defn fibonacci [x]
	(if (<= x 2) 1
		(+ (fibonacci (- x 2)) (fibonacci (- x 1)))))
	
(defn factorial [x]
	(if (= x 1) 1
		(* (factorial (- x 1)) x)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(defn -main [& args]
	;;(foo "main!!")
	(let [arg-1 (or (first args) "5")
		n (Integer/parseInt arg-1)]
		(println "fib(" n ")=" (fibonacci n))
		(println "!(" n ") =" (factorial n))
		))

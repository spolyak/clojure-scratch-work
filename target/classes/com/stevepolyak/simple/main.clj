(ns com.stevepolyak.simple.main)

; START:hello-world
(defn hello-world [username] 
  (println (format "Hello there, %s" username)))  
; END:hello-world

(defn main [args]
  (println "Hello World!")
  (hello-world "amy"))

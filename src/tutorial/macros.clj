(ns tutorial.macros)

;; when == if do
(macroexpand-1 '(when true (println "hello")))


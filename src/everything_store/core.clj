(ns everything-store.core)

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, World!"})

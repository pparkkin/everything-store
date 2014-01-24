(ns everything-store.core)

(defn handler [db]
  (fn [req]
    {:status 200
     :headers {"Content-Type" "text/html"}
     :body (:greeting db)}))

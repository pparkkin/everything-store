(ns everything-store.core)

(defn handler [db]
  (fn [req]
    (cond (= (:request-method req) :post)
          (dosync
           (alter db assoc (:uri req) (slurp (:body req)))
           {:status 200})
          (= (:request-method req) :get)
          {:status 200
           :body (get @db (:uri req))})))

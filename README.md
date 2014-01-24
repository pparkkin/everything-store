# everything-store

Trying out Ring with a made up online store REST API.

## Try this

'''
$ lein repl
'''

The following will start the server at localhost:8080.

'''clojure
(use 'ring.adapter.jetty)
(use 'everything-store.core)
(defonce server (run-jetty handler {:port 8080 :join? false}))
'''


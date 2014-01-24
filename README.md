# everything-store

Trying out Ring with a made up online store REST API.

## Try this

```
$ lein repl
```

The following will start the server at localhost:8080.

```clojure
(use 'ring.adapter.jetty)
(use 'everything-store.core :reload)
(defonce server (run-jetty (handler (ref {"/" "Hello, World"})) {:port 8080 :join? false}))
```


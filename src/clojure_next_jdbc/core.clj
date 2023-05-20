(ns clojure-next-jdbc.core
  (:require [next.jdbc :as jdbc]))

(def datasource-oracle-sid
  {
   :dbtype   "oracle:sid"
   :host     "localhost"
   :user     "user"
   :password "password"})

(jdbc/execute! datasource-oracle-sid ["SELECT * FROM DUAL"])

(def datasource-postgres
  {
   :dbtype   "postgresql"
   :dbname   "db-name"
   :host     "localhost"
   :port     5432
   :user     "user"
   :password "password"})

(jdbc/execute! datasource-postgres ["SELECT * FROM FUNCIONARIOS"])



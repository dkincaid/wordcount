(defproject wordcount "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "FIXME: write description"
  :source-paths ["src/clj"]
  :test-paths ["test/clj" "test/java"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options" "-g"]
  :resource-paths ["src/resources" "test/resources"]
  :repositories [["mapr-releases" "http://repository.mapr.com/maven/"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.mapr.hadoop/maprfs "1.0.3-mapr-2.1.2.1"]
                 [org.apache.zookeeper/zookeeper "3.3.5" :exclusions [javax.jms/jms com.sun.jdmk/jmxtools  com.sun.jmx/jmxri]]
                  [org.apache.hadoop/hadoop-core "1.0.3"]
                 ]
  :profiles {:dev { :dependencies [[org.apache.hadoop/hadoop-core "1.0.3"]]}}
  )


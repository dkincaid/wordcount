(defproject wordcount "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "FIXME: write description"
  :source-paths ["src/clj"]
  :test-paths ["test/clj" "test/java"]
  :java-source-paths ["src/java"]
  :javac-options ["-Xlint:-options" "-g"]
  :resource-paths ["src/resources" "test/resources"]
  :repositories [["mapr-releases" "http://repository.mapr.com/maven/"]]
  :dependencies [[org.apache.hadoop/hadoop-core "1.0.3-mapr-2.1.2.1"]])


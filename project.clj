(defproject com.draines/postal "1.9.2"
  :repositories {"java.net" "http://download.java.net/maven/2"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [commons-codec "1.7"]
                 [me.raynes/conch "0.5.1"]
                 [javax.mail/mail "1.4.4"
                  :exclusions [javax.activation/activation]]])

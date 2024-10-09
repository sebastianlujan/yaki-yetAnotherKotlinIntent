#DEPENDENCIES="junit-jupiter-api-5.7.0.jar:junit-jupiter-engine-5.7.0.jar"

kotlinc main.kt -cp $DEPENDENCIES -include-runtime -d main.jar
java -jar main.jar
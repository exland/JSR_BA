gradle build --parallel
java -jar /home/timc/Desktop/UNI/Batchelor/JSR_BA/jsr/JSR-CLI/build/libs/JSR-CLI-1.0-SNAPSHOT.jar reduce  -s JSR-Core/src/test/resources/smallProject/src/main/java   -j JSR-Core/src/test/resources/smallProject/build/libs/testJar.jar -l ../slicer/Slicer4J  -o JSR-CLI/build/jsr/cliTest01  -c JSR-Core/src/test/resources/smallProject/build/classes/java/main  --gen JSR-CLI/build/jsr/cliTest01/gen  --package at.tugraz.ist.stracke.jsr   --coverage line --algorithm genetic JSR-Core/src/test/resources/smallProject/src/test/java
## TODO  [TIM] disable other log outputs, maybe increses compile time
# TODO GeneticReductionStrategy() is default for testing
#gradle build
java -jar /home/timc/Desktop/UNI/Batchelor/JSR_BA/jsr/JSR-CLI/build/libs/JSR-CLI-1.0-SNAPSHOT.jar reduce  -s JSR-Core/src/test/resources/Paper/src/main/java/at/tugraz/ist/stracke/jsr   -j JSR-Core/src/test/resources/Paper/build/libs/testJar.jar -l ../slicer/Slicer4J  -o JSR-CLI/build/jsr/cliTest01  -c JSR-Core/src/test/resources/Paper/build/classes/java/main  --gen JSR-CLI/build/jsr/cliTest02/gen  --package at.tugraz.ist.stracke.jsr   --coverage line --algorithm genetic JSR-Core/src/test/resources/Paper/src/test/java

## TODO  [TIM] disable other log outputs, maybe decrease run time
# TODO GeneticReductionStrategy() is default for testing
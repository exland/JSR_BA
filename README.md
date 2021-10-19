# JSR - The Java Test Suite Reduction Framework 

JSR is a test suite reduction framework for Java. It consists of the following modules:


* JSR Core
* JSR CLI
* JSR IntelliJ IDE plugin

## JSR Core

The core framework module, containing the functionality and implementation of algorithms, calls to programs, libraries, etc.

More specifically, the Core modules provides APIs to clients for the following features:

* Test suite parsing and TS information collection
* Coverage calculation
* TSR calculation
* Spectrum-based Fault Localization (SFL) Matrix export

## JSR CLI

A CLI frontend of the JSR framework, supporting the following features:

* Test Suite Reduction
  * Using different coverage metrics
  * Using different TSR algorithms
    * Greedy HGS
    * Genetic 
* FSL Matrix export

## IDE Plugins/Extensions

The IntelliJ IDE Plugin serves as the front-end GUI. It directly integrates with IntelliJ so that developers can interact with JSR in a convenient and already established way. The Plugini provides JSR-Core functionality with a few additional features that only make sense in the IDE/GUI context:

* Define and persist JSR settings (paths, package names)
* Adjust TSR parameters (coverage type, TSR algorithm, Code generation)
* Perform a fresh TSR round (including coverage report generation)
* Perform  TSR round based on an already existent coverage report
* List retained and redundant test cases after a TSR round
* On click of a TC from the lists, the TC is opened up in the editor

## Installation

This chapter outlines how to install JSR. All steps are required to set it up properly.

Please note that the installation process is subject to change as the project progresses.

### 1. Requirements

* Java JDK 11 
  * make sure it is set as the default JDK version on your system
  * make sure, `JAVA_HOME` points to your default JDK
* Maven (required for building Slicer4J)
* Gradle (required for building this project)

### 2. JSR Installation

1. Clone this repository and navigate to the project root directory

```shell
git clone git@github.com:Lms24/JSR.git 
cd jsr
```

2. Execute the installation script to clone and build Slicer4J. 

```shell
sh install.sh
```

3. Build the JSR project (this will build the Core, CLI and IntelliJ Plugin modules)
   
Before building the actual project though, we need to initialize our testing environment so that the 
project build can properly run the unit tests:
   
```shell
cd jsr/JSR-Core/src/test/resources/smallProject
gradle
gradle build -x test
gradle testJar
```

Then, we can finally build the JSR framework

```shell
cd ../../.././../.. #so that we're in the 'jsr' root directory 
gradle
gradle build
```

Congratulations, JSR was built successfully.

Note: The commands in step 3 can also be started by opening the 
respective projects in IntelliJ and running the gradle tasks from the gradle plugin.

## Starting the IntelliJ Plugin

The JSR IntelliJ plugin is not yet published. Thus, it cannot simply be installed into your IntelliJ IDE instance.

Currently, one has to start IntelliJ in sandbox mode to work with the JSR plugin. The easiest way is to run:

```shell
gradle JSR-IntelliJ-Plugin:runIde
```

Alternatively, when the JSR project is already opened in IntelliJ, 
one can run the same gradle task from the gradle plugin.

## Using the Plugin

The following rundown is based on the `smallProject` that is used for integration tests
in the core library.

To try out the plugin, run IntelliJ as described above and open the `smallProject` 
under `jsr/JSR-Core/src/test/resources/smallProject`.  

This projects includes a test suite with around 15 tests of which many are purposefully 
redundant. 

Once the project is loaded and IntelliJ finished building its indexes, open the JSR plugin. 
It should be located either at the left or right hand side bars ("JSR").

#### Settings

JSR needs to know where some parts the project it should be ran on are located. The following 
list explains the settings items (with example values for `smallProject`):

* `Test Directory` is the root directory of your test suite. 
  For default Java projects this is usually similar to `project/src/test/java` 
  
  Example: `smallProject/src/test/java`


* `Source Directory` is the root source code directory of your project.
  For default Java projects this is usually similar to `project/src/main/java` 

  Example: `smallProject/src/main/java`


* `Jar File` is the path to your **fat jar**. This jar must contain the compiled **source and test classes**.  

  Example: `smallProject/build/libs/testJar.jar`


* `Classes Directory` is the path to your compiled java class files (required by JaCoCo)

  Example: `smallProject/build/classes/java/main`


* `Base Source Package` is the base package name of your project classes for which 
  line and method coverage should be calculated. You could use this as a filter if
  you want to perform TSR based on only a part of your project's sources (i.e. a sub package). 
  
  _This is an optional setting._

  Example: `at.tugraz`


* `Slicer Directory` is the path to Slicer4J. This helps JSR to find the 
  correct path to the slicer which is necessary to calculate checked coverage.

  Example: `<jsrProjectRoot>/jsr/slicer/Slicer4J`


* `Output Directory` is the path where all output files generated by JSR should be 
  written to. This directory will contain reports (coverage, Tsr), Exports (SFL) and 
  temporary files.
  
  Example: `smallProject/build/jsr/pluginTest01`


* `Code Output Directory` is the path to the directory where the generated test 
  source code is written to. The generated sources are equal to the orginal test 
  suite sources with the exception of identified redundant test cases. Those
  are deactivated via a JUnit annotation.
  
  Example: `smallProject/build/jsr/pluginTest01/gen`

### Parameters

Under the `TSR Options` tab, you can specify your TSR parameters. 
They should be pretty self expanatory. A short description can be found in the following list:

* `Coverage Report Selection` determines which coverage report should be used for reduction:
  * `New Report` will create a new coverage report with the selected coverage metric
  * `Previous Report` will use a report that was generated in previous TSR runs.
* `Reduction Algorithm` determines the employed algorithm in the reduction step
  * Currently, you can choose between `Greedy HGS` and a `Genetic` algorithm.
* `Deactivate redundant test cases` determines if test suite source code with redundant test cases
  deactivated should be generated or not.
  
### Starting a TSR run

After specifying the required settings and options parameters, you can start a TSR run by 
clicking the `Start TSR` button. Depending on whether a coverage report should be created, 
this might take a while. 

Once the TSR procedure is finished, two lists appear, one containing all relevant and thus _retained_ test cases
and the other one, containing all identified _redundant_ test cases. Clicking on a test case in either list
will trigger a navigation to the test case source code in the IntelliJ editor window(s).

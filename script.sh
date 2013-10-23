#! /bin/bash

echo "It's not yet time to light the lights"

### Following fragment shows how to run java assuming class files in bin sub-directory
#cd java/ITTLTL
#./jrun package.ClassName args...
#./jrun org.junit.runner.JUnitCore ittltl.DeployTest

### Following fragment shows how to run python
cd python
python ittltl/test/deploy_test.py
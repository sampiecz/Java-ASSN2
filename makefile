JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

CLASSES = \
Destination.java\
MileRedeemer.java\
MileComparator.java\
MileRedemptionApp.java

default: classes

classes: $(CLASSES:.java=.class)

clean: ; $(RM) *.class

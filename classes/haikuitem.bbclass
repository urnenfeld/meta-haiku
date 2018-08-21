# This Items are built from Haiku common source tree
# In class variables
#   HAIKU_SRC_LOCATION (haikucore)
#   HAIKU_USE_PRIVATE_HEADERS (user)
#   HAIKU_USE_OS_HEADERS (user)
# Output class variables
#   HAIKU_HEADERS

inherit haikucore

python () {

    def currentHeader():
        header = d.getVar("HAIKU_HEADERS", "")
        if header is None:
            return "-I${HAIKU_SRC_LOCATION}/headers/"
        else:
            return header

    def addHaikuPath(section,path):
        header = currentHeader() + " -I${HAIKU_SRC_LOCATION}/headers/"+section+"/" + path
        d.setVar("HAIKU_HEADERS", header)
        

    privateElements = d.getVar('HAIKU_USE_PRIVATE_HEADERS', True)
    if privateElements:
        for element in privateElements.split(" "):
            addHaikuPath("private", element)

    osElements = d.getVar('HAIKU_USE_OS_HEADERS', True)
    if osElements:
        addHaikuPath("os","") #add the root of as well os
        for element in osElements.split(" "):
            addHaikuPath("os", element)

}



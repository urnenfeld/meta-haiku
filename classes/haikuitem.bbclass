# This Items are built from Haiku common source tree

inherit haikucore


# HAIKU_USE_PRIVATE_HEADERS
# HAIKU_USE_HEADERS 


def addPrivateHaikuPath(e):
    pass
    # CFLAGS_prepend = "-I${HAIKU_SRC}/headers/private/e "

    
def addHaikuPath(e):
    pass
    # CFLAGS_prepend = "-I${HAIKU_SRC}/headers/e "


python () {
    privateElements = d.getVar('HAIKU_USE_PRIVATE_HEADERS', True)
    if privateElements:
        for element in privateElements:
            addPrivatePath(element)

    elements = d.getVar('HAIKU_USE_HEADERS', True)
    if elements:
        for element in elements:
            addPrivatePath(element)

}





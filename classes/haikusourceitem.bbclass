# This Items are built from Haiku common source tree
# In class variables
#   HAIKU_SOURCE_ITEM (user)

inherit haikucore

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${HAIKU_SRC_LOCATION}/License.md;md5=7e8295f10da48e31eefd6e1bb16808bd"

def generateSourcePath(haikuSources, haikuSourcesItem):
    return os.path.join(haikuSources, "src", *haikuSourcesItem.split(" "))

do_fetch () {
    
    if [ ${HAIKU_SOURCE_ITEM} != "" ]
    then    
        cp -r "${@generateSourcePath("${HAIKU_SRC_LOCATION}","${HAIKU_SOURCE_ITEM}")}" ${S}
    fi

}


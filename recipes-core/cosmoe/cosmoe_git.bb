SUMMARY = "Cosmoe, Haiku userland on top of Linux/BSD/Darwin based kernel/system."
HOMEPAGE = "http://github.com/Ithamar/cosmoe"

SRC_URI = "git://github.com/Ithamar/cosmoe.git;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git" 

# Cosmoe project cointains inside several licenses, mainly comming from Haiku Inc,
# Point to a Be Sample code license
LIC_FILES_CHKSUM = "file://src/apps/pulse/LICENSE;md5=4da74da693b41d0eda596b70885fa7ad"
LICENSE = "MIT"

inherit autotools
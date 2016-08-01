SUMMARY = "Cosmoe, Haiku userland on top of Linux/BSD/Darwin based kernel/system."
HOMEPAGE = "http://github.com/Ithamar/cosmoe"

SRC_URI = "git://github.com/Ithamar/cosmoe.git;protocol=https\
	   file://x11_unsafe_crosscompilation.patch"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git" 

# Cosmoe project cointains inside several licenses, mainly comming from Haiku Inc,
# Point to a Be Sample code license
LIC_FILES_CHKSUM = "file://src/apps/pulse/LICENSE;md5=4da74da693b41d0eda596b70885fa7ad"
LICENSE = "MIT"

# This is supossed to be the most complete solution at the time according to the README
# EXTRA_OECONF +=  "--enable-sdl"

inherit autotools-brokensep

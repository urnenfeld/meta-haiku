SUMMARY = "Haiku uses a custom fork of Perforce's Jam."
HOMEPAGE = "https://www.haiku-os.org/"

SRC_URI = "git://git.haiku-os.org/buildtools;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/jam"

LICENSE = "custom"
LIC_FILES_CHKSUM = "file://README;md5=2aaba14ff23856010e6b6000a4e45fd6"


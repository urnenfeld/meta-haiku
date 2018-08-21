SUMMARY = "Holk kernel kit based on cosmoe project"
HOMEPAGE = "https://github.com/urnenfeld/holk-kernel"


SRC_URI = "git://github.com/urnenfeld/holk-kernel.git;protocol=https"
SRCREV = "110df6213c4159d7816ea71fcca415d76ccf292a"

S = "${WORKDIR}/git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c25dca6f05d3d0d952c7fe9373c8b429"

HAIKU_USE_OS_HEADERS = "support storage kernel"

inherit haikuitem

do_compile() {

    ${CC} ${HAIKU_HEADERS} area.c

}

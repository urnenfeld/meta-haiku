SUMMARY = "Haiku is an open-source operating system that specifically targets personal computing. Inspired by the BeOS, Haiku is fast, simple to use, easy to learn and yet very powerful."
HOMEPAGE = "https://www.haiku-os.org/"

SRC_URI = "git://git.haiku-os.org/${PN};protocol=https \
           file://000_avoid_posix_error_redefinition.patch"

# https://github.com/haiku/haiku.git
           
SRC_URI[md5sum] = "ca5e5bf1e9b4d3177d1588f650349e1f"
SRC_URI[sha256sum] = "a3e765b9995f58a8eb4ac8bd4798f4a10408de8713a772f1556c29e411cdfcb7"

SRCREV = "44cff45d3d2390290803e802d0fa5a2079485da8"

inherit haikucore

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${HAIKU_SRC_LOCATION}/License.md;md5=7e8295f10da48e31eefd6e1bb16808bd"

WORKDIR = "${HAIKU_LOCATION}"

# point to git instead of WORKDIR/haiku_git
S = "${WORKDIR}${HAIKU_SRC_POSTFIX}"

# B = S
# S = ${WORKDIR}/${PN}-${PV}
# S = ${WORKDIR}/${BP}/
# BP = ${BPN}-${PV}

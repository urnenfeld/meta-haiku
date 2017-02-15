SUMMARY = "Haiku is an open-source operating system that specifically targets personal computing. Inspired by the BeOS, Haiku is fast, simple to use, easy to learn and yet very powerful."
HOMEPAGE = "https://www.haiku-os.org/"

SRC_URI = "git://git.haiku-os.org/${PN};protocol=https"
SRCREV = "${AUTOREV}"

inherit haikucore

WORKDIR = "${HAIKU_LOCATION}"

# point to git instead of WORKDIR/haiku_git
S = "${WORKDIR}${HAIKU_SRC_POSTFIX}"

# B = S
# S = ${WORKDIR}/${PN}-${PV}
# S = ${WORKDIR}/${BP}/
# BP = ${BPN}-${PV}

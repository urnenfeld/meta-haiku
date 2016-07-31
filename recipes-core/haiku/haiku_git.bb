SUMMARY = "Haiku is an open-source operating system that specifically targets personal computing. Inspired by the BeOS, Haiku is fast, simple to use, easy to learn and yet very powerful."
HOMEPAGE = "https://www.haiku-os.org/"

SRC_URI = "git://git.haiku-os.org/${PN};protocol=https"
SRCREV = "${AUTOREV}"

LICENSE = "MIT"

WORKDIR = "${TMPDIR}/work-shared/${PN}-${PV}-${PR}"

# B = "${WORKDIR}/${PN}-${PV}"
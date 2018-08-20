SUMMARY = "Haiku uses a custom fork of Perforce's Jam."
HOMEPAGE = "https://www.haiku-os.org/"

inherit native

#SRC_URI = "git://git.haiku-os.org/buildtools;protocol=https"
SRC_URI = "git://github.com/haiku/buildtools.git;protocol=https \
           file://000_use_OE_CC_variable.patch"


SRCREV = "974e12c1f068f161ec446d16a174e16be92b6773"

S = "${WORKDIR}/git/jam"

LICENSE = "custom"
LIC_FILES_CHKSUM = "file://README;md5=efa2ec3a53fc43f5fa49c4713a527315"

do_configure[noexec] = "1"


# Problem @do_compile
# | ar: invalid option -- 'n'
do_compile () {
    make
}


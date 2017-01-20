SUMMARY = "Cosmoe, Haiku userland on top of Linux/BSD/Darwin based kernel/system."
HOMEPAGE = "http://github.com/Ithamar/cosmoe"

SRC_URI = "git://github.com/Ithamar/cosmoe.git;protocol=https\
	   file://x11_unsafe_crosscompilation.patch \
	   file://atomic_exchange_kernel.patch"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git" 

# Possibly also a RDEPENDS
DEPENDS = "libpng jpeg freetype"

# Cosmoe project cointains inside several licenses, mainly comming from Haiku Inc,
# Point to a Be Sample code license
LIC_FILES_CHKSUM = "file://src/apps/pulse/LICENSE;md5=4da74da693b41d0eda596b70885fa7ad"
LICENSE = "MIT"

# This is supossed to be the most complete solution at the time according to the README
# EXTRA_OECONF +=  "--enable-sdl"

# Hopefully something like this could work in original makefile
# EXTRA_OEMAKE += "kits"

do_compile () {
    # trick to build only the kits which results in libcosmoe.so
    cd ${S}/src/kits
    oe_runmake    
}

inherit autotools-brokensep

# Install task AFTER inheriting, to override autotools class install task
do_install () {

	install -d -m 755 ${D}${libdir}
	install -p -m 644 src/kits/objs/libcosmoe.so ${D}${libdir}

}



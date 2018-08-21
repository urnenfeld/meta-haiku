# This Items are built from Haiku common source tree

HAIKU_LOCATION ?= "${TMPDIR}/work-shared/Haiku/"
HAIKU_SRC_POSTFIX ?= "git"

HAIKU_SRC_LOCATION = "${HAIKU_LOCATION}${HAIKU_SRC_POSTFIX}"

python () {    
    
    arch_dict = {'arm': '__ARMEL__', 
                 'i586': '__INTEL__',
                 'x86_64': '__x86_64__',
                 'powerpc': '__POWERPC__',
                 'powerpc64': None,
                 'mips': None,
                 'mipsel':'__MIPSEL__'
                }
    
    architecture = d.getVar("TARGET_ARCH","i586")
    
    if arch_dict[architecture] == None:
        bb.error("TARGET_ARCH value is not contemplated in the origin source tree, check configuration files if it can be added")
    else:
        d.setVar("HAIKU_TARGET_ARCH",arch_dict[architecture])
    
}

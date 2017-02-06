inherit haikuitem

# SRC_URI = "${HAIKU_SRC}/src/kits/interface/BPoint.cpp"


do_fetch () {

    cp -r ${HAIKU_SRC}/src/kits/interface/ ${S}

}

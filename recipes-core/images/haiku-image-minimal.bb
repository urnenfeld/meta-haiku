inherit core-image

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL += "mc"

# TODO: move to base files
# hostname_pn-base-files = "HaikuBox"

set_haiku_links () {

  mkdir ${IMAGE_ROOTFS}/Haiku
  mkdir ${IMAGE_ROOTFS}/Haiku/system
  mkdir ${IMAGE_ROOTFS}/Haiku/trash
  
  ln -s /home/ ${IMAGE_ROOTFS}/Haiku/home
  

}

ROOTFS_POSTPROCESS_COMMAND += "set_haiku_links;"

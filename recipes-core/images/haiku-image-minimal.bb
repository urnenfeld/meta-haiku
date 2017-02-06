inherit core-image

IMAGE_FEATURES += "splash ssh-server-dropbear"

set_hostname (){
     #!/bin/sh -e
     echo "Haiku" > ${IMAGE_ROOTFS}/etc/hostname;
}

set_haiku_links () {

  mkdir ${IMAGE_ROOTFS}/Haiku
  mkdir ${IMAGE_ROOTFS}/Haiku/system
  mkdir ${IMAGE_ROOTFS}/Haiku/trash
  
  ln -s ${IMAGE_ROOTFS}/home/ ${IMAGE_ROOTFS}/Haiku/home
  

}

ROOTFS_POSTPROCESS_COMMAND += "set_hostname; set_haiku_links;"

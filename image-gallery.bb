SUMMARY = "ImageGallery"
DESCRIPTION = "This recipe builds the ImageGallery Qt project."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRC_URI = "https://github.com/tcherepo/ImageGallery.git;branch=master"
SRCREV = "4e2cdebd2609869e8255b759f616e60e5c39a531"
SRC_URI[sha256sum] = "ccd9088cbb3b0e919e0decffdb1a84d399b3af73b3f6cde2e2448bf6e518cdb1"

S = "${WORKDIR}/git"

do_install_append() {
    install -d ${D}/opt/image-gallery/
    install -m 0755 ImageGallery ${D}/opt/image-gallery/
}

inherit qmake5


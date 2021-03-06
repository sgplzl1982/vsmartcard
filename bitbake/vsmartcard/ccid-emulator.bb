SUMMARY = "CCID Emulator"
DESCRIPTION = "Forward a PC/SC smartcard reader as a standard USB CCID reader"
HOMEPAGE = "http://vsmartcard.sourceforge.net"
BUGTRACKER = "http://sourceforge.net/projects/vsmartcard/support"

LICENSE     = "GPL-3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS     = "pcsc-lite linux-libc-headers openssl npa"
RDEPENDS   += "kernel-module-gadgetfs"

SRC_URI = "svn://vsmartcard.svn.sourceforge.net/svnroot;module=vsmartcard;proto=https"
SRCREV = "719"
PV = "0.6+svnr${SRCPV}"
PR = "r0"

S = "${WORKDIR}/vsmartcard/ccid"

inherit autotools pkgconfig

EXTRA_OECONF = 'OPENSSL_LIBS="${STAGING_DIR_TARGET}/lib/libcrypto.a -ldl" --enable-pace'

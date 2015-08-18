$(function () {
    $.lc4e.index = {
        ready: function () {

            $("#config-tool-options .ui.list .item[data-target^='#']").on('click', function () {
                $(this).parent().transition('fade left');
                $($(this).attr('data-target')).transition('fade left');
                $('#config-tool-options .angle.double.left.icon').removeClass('transition hidden');
            });

            $('#config-tool-options .ui.checkbox').checkbox();

            $('#fixFooter').checkbox({
                onChange: function (e) {
                    $('#content').toggleClass('footerFixed');
                    $('.ui.footer').toggleClass('fixed');
                }
            });

            $('#colorBackground').checkbox({
                onChange: function (e) {
                    $.Lc4eStars();
                }
            });
            $('#boxedLayout').checkbox({
                onChange: function (e) {
                    $('#articlelist').toggleClass('nobox');
                }
            });

            $('#announce').shape();

            $.Lc4eAjax({
                url: "/?p=" + parseInt($("#articlelist>.ui.divided.items").attr("page")),
                target: '#articlelist>.ui.divided.items',
                pjax: true,
                success: function (data) {
                    $.requestAnimationFrame(function () {
                        $('#articlelist>.ui.divided.items>.item').
                            transition({
                                animation: 'fade up in',
                                duration: 500,
                                interval: 80,
                                onComplete: function () {
                                    $('#articlelist>.ui.divided.items>.item').find('.ui.fluid.image img').popup();
                                }
                            });
                    })

                }
            });

            $.get('/TopHots').done(function (data) {
                $('#todayHot>.ui.divided.items,#yesterdayHot>.ui.divided.items').empty().append(data);
                $('#todayHot>.ui.divided.items>.item,#yesterdayHot>.ui.divided.items').
                    transition({
                        animation: 'fade right',
                        duration: 100,
                        interval: 50
                    })
            });



            $('#prePage,#nextPage').on('click', function () {
                var page = parseInt($("#articlelist>.ui.divided.items").attr("page")) + 1;
                $("#articlelist>.ui.divided.items").attr("page", page);
                $.Lc4eAjax({
                    url: "/?p=" + page,
                    target: '#articlelist>.ui.divided.items',
                    pjax: true,
                    success: function (data) {
                        $.requestAnimationFrame(function () {
                            $('#articlelist>.ui.divided.items>.item').
                                transition({
                                    animation: 'fade up in',
                                    duration: 500,
                                    interval: 100,
                                    onComplete: function () {
                                        $('#articlelist>.ui.divided.items>.item').find('.ui.fluid.image img').popup();
                                    }
                                });
                        });
                    }
                })
            });

            setInterval(function () {
                $('#announce').shape('flip down');
            }, 4000);

        }
    };
    $.lc4e.index.ready();
});
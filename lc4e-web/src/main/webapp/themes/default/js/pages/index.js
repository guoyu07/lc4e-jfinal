/**
 * Created by teddy on 2015/8/30.
 */

$.extend($.lc4e, {
    index: {
        ready: function () {
            $.lc4e.index.bindEvent();
            $.lc4e.index.run();
        },
        run: function () {
            var $topicItems = $('#topicItems'),
                $topicSetting = $topicItems.find('.topicSetting'),
                $topicPopup = $topicItems.find('>.item .ui.fluid.image img');
            $topicSetting.dropdown();
            $topicPopup.popup();
        },
        bindEvent: function () {
            var $announce = $('#announce'),
                $attachedHeader = $('#attachedHeader'),
                $topicItems = $('#topicItems'),
                sortItem = $topicItems.attr('data-sort'),
                area = localStorage.getItem('area'),
                $sortTopic = $('#sortTopic');
            $attachedHeader.attr('data-area', area ? area : 'index');
            $announce.shape();
            $sortTopic.dropdown().dropdown('set selected', sortItem ? sortItem : $sortTopic.find('.scrolling.menu>.item:first').attr('data-value'));

            $('#prePage,#nextPage,#ft_next,#ft_prev').on('click', function () {
                var $items = $('#topicItems'), page = parseInt($items.attr("data-page")) + 1, sort = parseInt($sortTopic.dropdown('get value'));
                $.Lc4eAjax({
                    url: "/" + sort + "-" + page,
                    data: {art: true, a: $attachedHeader.attr('data-area')},
                    target: '#articlelist>.ui.divided.items',
                    pjax: true,
                    loading: 'loading articles',
                    animate: 'slow fadeIn',
                    success: function (data, status, $target) {
                        $target.find('.topicSetting').dropdown();
                        $target.find('>.item .ui.fluid.image img').popup();
                        $('#topicItems').attr("data-page", page);
                    }
                })
            });

            $topicItems.on('click', function (e) {
                var $target = $(e.target);
                if ($target.hasClass('content')) {
                    window.location.href = $target.find('a.header').attr('href');
                } else if ($target.hasClass('extra')) {
                    window.location.href = $target.prev().attr('href');
                }
            });
            setTimeout(function () {
                $.lc4e.index.shape($announce);
            }, 10000);
        },
        shape: function ($announce) {
            $announce.shape('flip down');
            setTimeout(function () {
                $.lc4e.index.shape($announce)
            }, 10000);
        }
    }
});